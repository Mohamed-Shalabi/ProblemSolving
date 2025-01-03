class Solution {
  int hIndex(List<int> citations) {
    return citations
            .sorted()
            .indexed
            .lastWhere(
              _filter,
              orElse: _notFound,
            )
            .$1 +
        1;
  }
}

extension on List<int> {
  List<int> sorted() {
    final result = [...this];
    result.sort((a, b) => b.compareTo(a));
    return result;
  }
}

bool _filter((int index, int e) item) {
  final (index, e) = item;
  return index + 1 <= e;
}

(int, int) _notFound() => (-1, 0);
