package example.deterministic.finite.automaton.constraints;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

import org.sidiff.validation.constraint.project.registry.*;

import org.sidiff.validation.constraint.interpreter.*;
import org.sidiff.validation.constraint.interpreter.formulas.*;
import org.sidiff.validation.constraint.interpreter.formulas.binary.*;
import org.sidiff.validation.constraint.interpreter.formulas.predicates.*;
import org.sidiff.validation.constraint.interpreter.formulas.predicates.collections.*;
import org.sidiff.validation.constraint.interpreter.formulas.predicates.integers.*;
import org.sidiff.validation.constraint.interpreter.formulas.predicates.types.*;
import org.sidiff.validation.constraint.interpreter.formulas.quantifiers.*;
import org.sidiff.validation.constraint.interpreter.formulas.unary.*;
import org.sidiff.validation.constraint.interpreter.terms.*;
import org.sidiff.validation.constraint.interpreter.terms.constants.*;
import org.sidiff.validation.constraint.interpreter.terms.functions.*;
import org.sidiff.validation.constraint.interpreter.terms.functions.collections.*;
import org.sidiff.validation.constraint.interpreter.terms.functions.navigation.*;
import org.sidiff.validation.constraint.interpreter.terms.functions.strings.*;

public class DFAModelConstraints implements IConstraintLibrary {
	
	private String name = "DFAModel Constraints";
	
	private Set<String> domains;
	
	private Set<String> documentTypes;
	
	private Map<String, IConstraint> constraints;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public Set<String> getDomains() {
		
		if (domains == null) {
			this.domains = new LinkedHashSet<>();
			 
			addDomain("http://www.example.org/dfamodel");
		}
		
		return domains;
	}
	
	private void addDomain(String domain) {
		domains.add(domain);
	}
	
	@Override
	public Set<String> getDocumentTypes() {
		
		if (documentTypes == null) {
			documentTypes = new LinkedHashSet<>();
			
			addDocumentType("http://www.example.org/dfamodel");
		}
		
		return documentTypes;
	}
	
	private void addDocumentType(String documentType) {
		documentTypes.add(documentType);
	}
	
	public Map<String, IConstraint> getConstraintEntries() {
		
		if (constraints == null) {
			constraints = new LinkedHashMap<>();
		
			addConstraint(createaDFANeedsAtLeastOneStateConstraint());
			addConstraint(createexactlyOneStateMustBeAnInitialStateConstraint());
			addConstraint(createthereMustBeAtLeastOneFinalStateConstraint());
			addConstraint(createtransitionsMustBeLabeledConstraint());
		}
		
		return constraints;
	}
	
	private void addConstraint(IConstraint rule) {
		constraints.put(rule.getName(), rule);
	}
	
	@Override
	public List<IConstraint> getConstraints() {
		return new ArrayList<>(getConstraintEntries().values());
	}
	
	@Override
	public IConstraint getConstraint(String name) {
		return getConstraintEntries().get(name);
	}
	
	public static IConstraint createaDFANeedsAtLeastOneStateConstraint() {
		
		Variable v_dfa = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA, "dfa");
		
		Term t_states = new Get(v_dfa, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA__STATES);
		
		Formula formula = new IsGreater(new Size(t_states), new Constant(0));
		
		IConstraint constraint_aDFANeedsAtLeastOneState = new Constraint(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA, v_dfa, formula);
		constraint_aDFANeedsAtLeastOneState.setName("aDFANeedsAtLeastOneState");
		constraint_aDFANeedsAtLeastOneState.setMessage("A DFA needs at least one state.");
		
		return constraint_aDFANeedsAtLeastOneState;
	}
	
	public static IConstraint createexactlyOneStateMustBeAnInitialStateConstraint() {
		
		Variable v_dfa = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA, "dfa");
		Variable v_startState = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.STATE, "startState");
		Variable v_otherState = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.STATE, "otherState");
		
		Term t_states = new Get(v_dfa, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA__STATES);
		Term t_isStart = new Get(v_startState, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.STATE__IS_START);
		Term t_states_1 = new Get(v_dfa, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA__STATES);
		Term t_isStart_1 = new Get(v_otherState, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.STATE__IS_START);
		
		Formula formula = new Exists(v_startState, t_states, new And(new Equality(t_isStart, BoolConstant.TRUE), new Not(new Exists(v_otherState, t_states_1, new And(new Not(new Equality(v_startState, v_otherState)), new Equality(t_isStart_1, BoolConstant.TRUE))))));
		
		IConstraint constraint_exactlyOneStateMustBeAnInitialState = new Constraint(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA, v_dfa, formula);
		constraint_exactlyOneStateMustBeAnInitialState.setName("exactlyOneStateMustBeAnInitialState");
		constraint_exactlyOneStateMustBeAnInitialState.setMessage("Exactly one state must be an initial state (isStart == true).");
		
		return constraint_exactlyOneStateMustBeAnInitialState;
	}
	
	public static IConstraint createthereMustBeAtLeastOneFinalStateConstraint() {
		
		Variable v_dfa = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA, "dfa");
		Variable v_s = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.STATE, "s");
		
		Term t_states = new Get(v_dfa, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA__STATES);
		Term t_isEnd = new Get(v_s, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.STATE__IS_END);
		
		Formula formula = new Exists(v_s, t_states, new Equality(t_isEnd, BoolConstant.TRUE));
		
		IConstraint constraint_thereMustBeAtLeastOneFinalState = new Constraint(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.DFA, v_dfa, formula);
		constraint_thereMustBeAtLeastOneFinalState.setName("thereMustBeAtLeastOneFinalState");
		constraint_thereMustBeAtLeastOneFinalState.setMessage("There must be at least one final state (isEnd == true)");
		
		return constraint_thereMustBeAtLeastOneFinalState;
	}
	
	public static IConstraint createtransitionsMustBeLabeledConstraint() {
		
		Variable v_transition = new Variable(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.TRANSITION, "transition");
		
		Term t_input = new Get(v_transition, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.TRANSITION__INPUT);
		Term t_input_1 = new Get(v_transition, example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.TRANSITION__INPUT);
		
		Formula formula = new And(new Not(new IsEmpty(t_input)), new Not(new Equality(t_input_1, new Constant(""))));
		
		IConstraint constraint_transitionsMustBeLabeled = new Constraint(example.deterministic.finite.automaton.model.dfamodel.DFAModelPackage.Literals.TRANSITION, v_transition, formula);
		constraint_transitionsMustBeLabeled.setName("transitionsMustBeLabeled");
		constraint_transitionsMustBeLabeled.setMessage("Transitions must be labeled (not empty or null)");
		
		return constraint_transitionsMustBeLabeled;
	}
	
}
