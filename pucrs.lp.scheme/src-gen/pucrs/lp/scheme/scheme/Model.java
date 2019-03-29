/**
 * generated by Xtext 2.15.0
 */
package pucrs.lp.scheme.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pucrs.lp.scheme.scheme.Model#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see pucrs.lp.scheme.scheme.SchemePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link pucrs.lp.scheme.scheme.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see pucrs.lp.scheme.scheme.SchemePackage#getModel_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Model
