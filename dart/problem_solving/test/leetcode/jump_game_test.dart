import 'package:problem_solving/leetcode/jump_game.dart' as p;
import 'package:test/test.dart';

void main() {
  group(
    'Tests for "Jump Game"',
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
          final res = solution.canJump([2, 3, 1, 1, 4]);
          expect(res, equals(true));
        },
      );

      test(
        'case 2',
        () {
          final res = solution.canJump([3, 2, 1, 0, 4]);
          expect(res, equals(false));
        },
      );

      test(
        'case 3',
        () {
          final res = solution.canJump([0]);
          expect(res, equals(true));
        },
      );
    },
  );
}
