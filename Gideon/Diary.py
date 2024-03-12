from Entry import Entry


class Diary:

    def __init__(self, username: str, password: str):
        self.username = username
        self.password = password
        self.is_locked = False
        self.entries = []

    def unlock_diary(self, password):
        if self.password != password:
            raise ValueError("Wrong password")
        self.is_locked = False

    def lock(self):
        self.is_locked = True

    def create_entry(self, title: str, body: str):
        id_number = 1
        entry = Entry(id_number, title, body)
        self.entries.append(entry)
        return entry

    def delete_entry_by_id(self, id_number: int):
        for entry in self.entries:
            if entry.id_number == id_number:
                self.entries.remove(entry)

    def find_entry_by_id(self, id_number: int):
        for entry in self.entries:
            if entry.id_number == id_number:
                return entry

    def update_entry(self, id_number: int, title: str, body: str):
        for entry in self.entries:
            if entry.id_number == id_number:
                entry.set_title(title)
                entry.set_body(body)










