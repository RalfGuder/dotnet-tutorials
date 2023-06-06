using System;
using Gudchensoft;

// Tiere im Streichelzoo
string[] pettingZoo = 
{
    "alpacas", "capybaras", "chickens", "ducks", "emus", "geese", 
    "goats", "iguanas", "kangaroos", "lemurs", "llamas", "macaws", 
    "ostriches", "pigs", "ponies", "rabbits", "sheep", "tortoises",
};

// Die erste Aufgabe besteht darin, die Tiere zu randomisieren. Erstellen Sie eine Pseudocodemethode, um die Tiere im Streichelzoo zu randomisieren.
RandomizeAnimals();

// Erstellen Sie als Nächstes eine Pseudocodemethode, um die Tiergruppen zuzuweisen.
// string[,] group = AssignGroup();

// Sie können den Schulnamen ganz einfach mit Console.Write ausgeben.
Console.WriteLine("School A");

// Schließlich müssen Sie die Tiergruppen ausgeben.
// PrintGroup(group);

void RandomizeAnimals() 
{
    Random random = new Random();

    for (int i = 0; i < pettingZoo.Length; i++) 
    {
        int r = random.Next(i, pettingZoo.Length);

        string temp = pettingZoo[r];
        pettingZoo[r] = pettingZoo[i];
        pettingZoo[i] = temp;
    }
}
