/**
 * generated by Xtext 2.17.0
 */
package pucrs.lp.scheme.scheme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pucrs.lp.scheme.scheme.Operation#getOperator <em>Operator</em>}</li>
 *   <li>{@link pucrs.lp.scheme.scheme.Operation#getSimpleOperation <em>Simple Operation</em>}</li>
 *   <li>{@link pucrs.lp.scheme.scheme.Operation#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @see pucrs.lp.scheme.scheme.SchemePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Command
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see pucrs.lp.scheme.scheme.SchemePackage#getOperation_Operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperator();

  /**
   * Returns the value of the '<em><b>Simple Operation</b></em>' containment reference list.
   * The list contents are of type {@link pucrs.lp.scheme.scheme.SimpleOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Operation</em>' containment reference list.
   * @see pucrs.lp.scheme.scheme.SchemePackage#getOperation_SimpleOperation()
   * @model containment="true"
   * @generated
   */
  EList<SimpleOperation> getSimpleOperation();

  /**
   * Returns the value of the '<em><b>Atom</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' attribute list.
   * @see pucrs.lp.scheme.scheme.SchemePackage#getOperation_Atom()
   * @model unique="false"
   * @generated
   */
  EList<String> getAtom();

} // Operation
