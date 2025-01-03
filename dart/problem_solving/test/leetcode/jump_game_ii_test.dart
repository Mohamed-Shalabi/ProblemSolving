import 'package:problem_solving/leetcode/jump_game_ii.dart' as p;
import 'package:test/test.dart';

void main() {
  group(
    'Tests for "Jump Game II"',
    () {
      late p.Solution solution;

      setUp(
        () {
          solution = p.Solution();
        },
      );

      test(
        'case 1',
        () {
          final res = solution.jump([2, 3, 1, 1, 4]);
          expect(res, equals(2));
        },
      );

      test(
        'case 2',
        () {
          final res = solution.jump([2, 3, 0, 1, 4]);
          expect(res, equals(2));
        },
      );

      test(
        'case 3',
        () {
          final res = solution.jump([2, 3, 1]);
          expect(res, equals(1));
        },
      );

      test(
        'case 4',
        () {
          final res = solution.jump([1, 2, 3]);
          expect(res, equals(2));
        },
      );
    },
  );
}
