class Diaries:

    def __init__(self):
        self.diaries = []

    def add(self,username:str, password: str):
        self.diaries.append(self.diaries.username + " " + password)
        return self



    def find_by_username(self, username):
        for diary in self.diaries:
            if username == diary.username:
                return diary

    def delete(self, username:str, password:str):
         for diary in self.diaries:
            if username == diary.username:
              self.diaries.remove(diary)
