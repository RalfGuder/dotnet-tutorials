// Copyright (C) 2017  Kazuya Ujihara
// This file is under LGPL-2.1 

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Reflection;

namespace Gudchensoft
{
    /**
     * <summary>Willy</summary>
     */
    internal class ServiceLoader<T> : IEnumerable<T> 
    {
        List<Type> types = new List<Type>();

        private ServiceLoader()
        { }

        public IEnumerator<T> GetEnumerator()
        {
            foreach (var type in types)
            {
                bool succeed = false;
                T? o = default(T);
                try
                {
                    if(type is not null)
                    {
                        System.Reflection.ConstructorInfo? construcorInfo = type.GetConstructor(Type.EmptyTypes);
                        if (construcorInfo != null)
                        {
							o = (T)construcorInfo.Invoke(Array.Empty<object>());
							succeed = true;
						}


					}


				}
                catch (Exception)
                { }
                if (succeed && o != null)
                    yield return o;
            }
            yield break;
        }

        public static ServiceLoader<T> Load()
        {
            var loader = new ServiceLoader<T>();

            var x1 = AppDomain.CurrentDomain.GetAssemblies();

            using (var srm = typeof(T).Assembly.GetManifestResourceStream(typeof(T).FullName!))
            using (var reader = new StreamReader(srm!))
            {
                string? line;
                while ((line = reader.ReadLine()) != null)
                {
                    line = line.Trim();
                    if (string.IsNullOrEmpty(line) || line[0] == '#')
                        continue;
                    try
                    {
                        var type = typeof(T).Assembly.GetType(line);
                        if (type == null)
                            continue;
                        loader.types.Add(type);
                    }
                    catch (Exception)
                    {
                    }
                }
            }
            return loader;
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }
    }
}
