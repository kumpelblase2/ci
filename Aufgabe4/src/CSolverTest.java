import java.util.HashSet;
import java.util.Set;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.cp.solver.search.integer.branching.AssignVar;
import choco.cp.solver.search.integer.branching.ImpactBasedBranching;
import choco.cp.solver.search.integer.valiterator.IncreasingDomain;
import choco.cp.solver.search.integer.varselector.MinDomain;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import static choco.Choco.*;

public class CSolverTest
{

	public static void main(String[] args) {
		Model model = new CPModel();

		IntegerVariable A = makeIntVar("a", 0, 9, Options.V_ENUM);
		IntegerVariable B = makeIntVar("b", 0, 9, Options.V_ENUM);
		IntegerVariable C = makeIntVar("c", 0, 9, Options.V_ENUM);
		IntegerVariable D = makeIntVar("d", 0, 9, Options.V_ENUM);
		IntegerVariable E = makeIntVar("e", 0, 9, Options.V_ENUM);
		IntegerVariable F = makeIntVar("f", 0, 9, Options.V_ENUM);
		IntegerVariable G = makeIntVar("g", 0, 9, Options.V_ENUM);
		IntegerVariable H = makeIntVar("h", 0, 9, Options.V_ENUM);
		IntegerVariable I = makeIntVar("i", 0, 9, Options.V_ENUM);
		IntegerVariable J = makeIntVar("j", 0, 9, Options.V_ENUM);
		IntegerVariable K = makeIntVar("k", 0, 9, Options.V_ENUM);
		IntegerVariable L = makeIntVar("l", 0, 9, Options.V_ENUM);
		IntegerVariable M = makeIntVar("m", 0, 9, Options.V_ENUM);
		IntegerVariable N = makeIntVar("n", 0, 9, Options.V_ENUM);
		IntegerVariable O = makeIntVar("o", 0, 9, Options.V_ENUM);
		IntegerVariable P = makeIntVar("p", 0, 9, Options.V_ENUM);
		IntegerVariable Q = makeIntVar("q", 0, 9, Options.V_ENUM);
		IntegerVariable R = makeIntVar("r", 0, 9, Options.V_ENUM);
		IntegerVariable S = makeIntVar("s", 0, 9, Options.V_ENUM);
		IntegerVariable T = makeIntVar("t", 0, 9, Options.V_ENUM);
		IntegerVariable U = makeIntVar("u", 0, 9, Options.V_ENUM);
		IntegerVariable V = makeIntVar("v", 0, 9, Options.V_ENUM);
		IntegerVariable W = makeIntVar("w", 0, 9, Options.V_ENUM);
		IntegerVariable X = makeIntVar("x", 0, 9, Options.V_ENUM);
		IntegerVariable Y = makeIntVar("y", 0, 9, Options.V_ENUM);
		IntegerVariable Z = makeIntVar("z", 0, 9, Options.V_ENUM);

		IntegerVariable ZERO = makeIntVar("ZERO", 0, 0, Options.V_ENUM);
		Set<IntegerVariable> used = new HashSet<IntegerVariable>();

		IntegerVariable prevCarry = ZERO;
		IntegerVariable carry;
		int index = 0;

		prevCarry = ZERO;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(C, E), prevCarry), plus(F, mult(carry, 10))));
		used.add(C);
		used.add(E);
		used.add(F);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(B, D), prevCarry), plus(C, mult(carry, 10))));
		used.add(B);
		used.add(D);
		used.add(C);

		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(A, D), prevCarry), plus(F, mult(carry, 10))));
		used.add(A);
		used.add(D);
		used.add(F);
		model.addConstraint(eq(ZERO, carry));



		prevCarry = ZERO;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(B, E), prevCarry), plus(A, mult(carry, 10))));
		used.add(B);
		used.add(E);
		used.add(A);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(C, G), prevCarry), plus(C, mult(carry, 10))));
		used.add(C);
		used.add(G);
		used.add(C);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(ZERO, B), prevCarry), plus(B, mult(carry, 10))));
		used.add(B);
		used.add(B);
		model.addConstraint(eq(ZERO, carry));



		prevCarry = ZERO;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(E, G), prevCarry), plus(E, mult(carry, 10))));
		used.add(E);
		used.add(G);
		used.add(E);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(E, B), prevCarry), plus(A, mult(carry, 10))));
		used.add(E);
		used.add(B);
		used.add(A);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(A, C), prevCarry), plus(G, mult(carry, 10))));
		used.add(A);
		used.add(C);
		used.add(G);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(ZERO, ZERO), prevCarry), plus(D, mult(carry, 10))));
		used.add(D);
		model.addConstraint(eq(ZERO, carry));




		prevCarry = ZERO;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(C, B), prevCarry), plus(E, mult(carry, 10))));
		used.add(C);
		used.add(B);
		used.add(E);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(B, C), prevCarry), plus(E, mult(carry, 10))));
		used.add(B);
		used.add(C);
		used.add(E);

		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(A, ZERO), prevCarry), plus(A, mult(carry, 10))));
		used.add(A);
		used.add(A);
		model.addConstraint(eq(ZERO, carry));





		prevCarry = ZERO;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(E, E), prevCarry), plus(G, mult(carry, 10))));
		used.add(E);
		used.add(G);
		used.add(E);
		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(G, D), prevCarry), plus(B, mult(carry, 10))));
		used.add(G);
		used.add(B);
		used.add(D);
		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(B, D), prevCarry), plus(C, mult(carry, 10))));
		used.add(B);
		used.add(C);
		used.add(D);
		model.addConstraint(eq(ZERO, carry));




		prevCarry = ZERO;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(F, A), prevCarry), plus(E, mult(carry, 10))));
		used.add(F);
		used.add(A);
		used.add(E);
		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(C, C), prevCarry), plus(A, mult(carry, 10))));
		used.add(C);
		used.add(C);
		used.add(A);
		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(F, B), prevCarry), plus(G, mult(carry, 10))));
		used.add(F);
		used.add(B);
		used.add(G);
		prevCarry = carry;
		carry = makeIntVar("u" + index++, 0, 1, Options.V_ENUM);
		model.addConstraint(eq(plus(plus(ZERO, ZERO), prevCarry), plus(D, mult(carry, 10))));
		used.add(D);
		model.addConstraint(eq(ZERO, carry));


		System.out.println(model.constraintsToString());
		model.addConstraint(allDifferent(used.toArray(new IntegerVariable[used.size()])));
		Solver s = new CPSolver();
		s.read(model);
		s.solve();
		s.checkSolution();

		System.out.println(s.solutionToString());
		for(IntegerVariable var : used) {
			System.out.println(var.getName() + " = " + s.getVar(var).getVal());
		}
	}
}
