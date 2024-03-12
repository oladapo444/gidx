import unittest


class TestDaries(unittest.TestCase):

    def test_Daries_add(self):
     self.Daries1=self.daries ("ola123",11111)
     self.Daries2=self.daries("ere323","44444")
     self.assertEqual(self.Daries.get_name(),"ola123")
     self.assertEqual(2,self.Daries2.get_number())

