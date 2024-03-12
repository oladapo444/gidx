class Gun:

    def __init__(self, model, capacity, caliber):
        self.model = model
        self.capacity = capacity
        self.caliber = caliber

    def load(self, ammo):
            if self.ammo <= self.capacity:
             self.ammo_count += ammo

    def unload(self, ammo):
        if self.ammo <= self.capacity:
            self.ammo_count -= ammo

    def fire(self):
        if self.fire >= self.capacity:
            self.ammo_Count > 0
        else:
             self.ammo_Count = self