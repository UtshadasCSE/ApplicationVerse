void main(List<String> args) {
  Student('utsha', roll: 201, age: 22);
}

void Student(var name, {var roll, var age}) {
  print(name);
  print(roll);
  print(age);
}
