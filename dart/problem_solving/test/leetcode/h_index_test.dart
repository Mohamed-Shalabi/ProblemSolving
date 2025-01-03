import 'package:problem_solving/leetcode/h_index.dart' as p;
import 'package:test/test.dart';

void main() {
  group(
    'Tests for "H-Index"',
    () {
      late p.Solution solution;

      setUp(
        () {
          solution = p.Solution();
        },
      );

      test(
        'A single element equals 0',
        () {
          final res = solution.hIndex([0]);
          expect(res, equals(0));
        },
      );

      test(
        'A single element not equals 0',
        () {
          final res = solution.hIndex([100]);
          expect(res, equals(1));
        },
      );

      test(
        'multiple equal elements, all of them represents h-index',
        () {
          final res = solution.hIndex([3, 3, 3]);
          expect(res, equals(3));
        },
      );

      test(
        'multiple equal elements, none of them represents h-index',
        () {
          final res = solution.hIndex([4, 4, 4]);
          expect(res, equals(3));
        },
      );

      test(
        'case 1',
        () {
          final res = solution.hIndex([3, 0, 6, 1, 5]);
          expect(res, equals(3));
        },
      );

      test(
        'case 2',
        () {
          final res = solution.hIndex([1, 3, 1]);
          expect(res, equals(1));
        },
        skip: true,
      );
    },
  );
}
