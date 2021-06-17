from car import Car
from account import Account


if __name__ == "__main__":
    print("hello word")
    account = Account("Albert Hack", "ASDF123")
    car = Car("QWER123", account)
    print(f"\nThe license # is: {car.license} and the driver name and document # its: {account.name} #{account.document}. \n")

    car2 = Car("ZXCV123", Account("Rosy ", "WER1747"))
    print(vars(car2))
    print(vars(car2.driver))