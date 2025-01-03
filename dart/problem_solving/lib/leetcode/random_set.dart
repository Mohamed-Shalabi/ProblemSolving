import 'dart:math';

class RandomizedSet {
  final Map<int, int> valueToIndex;
  final List<int> values;
  final Random random;

  RandomizedSet()
      : valueToIndex = {},
        values = [],
        random = Random();

  bool insert(int val) {
    if (valueToIndex.containsKey(val)) {
      return false;
    }

    valueToIndex[val] = values.length;
    values.add(val);
    return true;
  }

  bool remove(int val) {
    if (!valueToIndex.containsKey(val)) {
      return false;
    }

    int index = valueToIndex[val]!;
    int lastValue = values.last;

    // Swap the value to be removed with the last value
    values[index] = lastValue;
    valueToIndex[lastValue] = index;

    // Remove the last value
    values.removeLast();
    valueToIndex.remove(val);

    return true;
  }

  int getRandom() {
    int randomIndex = random.nextInt(values.length);
    return values[randomIndex];
  }
}
