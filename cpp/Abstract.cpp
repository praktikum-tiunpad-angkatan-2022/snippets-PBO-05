#include <iostream>

using namespace std;

class Animal {
   public:
      virtual void getSound() = 0;
};

class Tiger: public Animal {
  public:
    void getSound() {
      cout << "Roar";
    }
};

int main(int argc, char const *argv[])
{
    Tiger tigger;
    tigger.getSound();
}
