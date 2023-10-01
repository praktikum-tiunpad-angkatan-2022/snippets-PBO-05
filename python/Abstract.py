from abc import ABC,abstractmethod
 
class Animal(ABC):
    @abstractmethod
    def getSound(self):
        pass

class Snake(Animal):
    def getSound(self):
        print("HISSS")

def main():
    obj = Snake()
    obj.getSound()

if __name__=="__main__":
    main()