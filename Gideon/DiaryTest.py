import unittest

from Diary import Diary


class DiaryTest(unittest.TestCase):
    def setUp(self):
        self.diary = Diary("DiaryTest", "password")

    def test_diary_unlock(self):
        self.assertFalse(self.diary.is_locked)

    def test_diary_lock(self):
        self.diary.lock()
        self.assertTrue(self.diary.is_locked)

    def test_diary_create_entry_with_id(self):
        self.diary.create_entry(id, "body")
        self.assertTrue(self.diary.create_entry)
    def test_diary_update_entry_with_id(self):
        self.diary.update_entry(id, "title","body")
        self.assertTrue(self.diary.update_entry)

    def test_diary_find_entry_by_id(self):
        entry = self.diary.create_entry("title","body")
        self.diary.find_entry_by_id(1)
        self.assertEqual(self.diary.find_entry_by_id(1), entry)

    def test_diary_delete_entry_by_id(self):
          entry = self.diary.create_entry("title","body")
          self.diary.delete_entry_by_id(1)


