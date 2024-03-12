class Entry:
    def __init__(self, id_number: int, title: str, body: str):
        self.id_number = id_number
        self.title = title
        self.body = body

    def set_title(self, title: str):
        self.title = title

    def set_body(self, body: str):
        self.body = body
