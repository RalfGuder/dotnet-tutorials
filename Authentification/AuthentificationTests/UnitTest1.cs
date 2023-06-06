namespace ORPhEuS.Authentification.Service
{
	public class Tests
	{
		private IAuthentificationService? serv;
		[SetUp]
		public void Setup()
		{
			var x = ServiceLoader<IAuthentificationService>.Load();
			foreach(IAuthentificationService s in x)
			{
				serv = s;
			}
		}

		[Test]
		public void TestServiceSuccess()
		{
			Assert.NotNull(serv);
		}
	}
}


