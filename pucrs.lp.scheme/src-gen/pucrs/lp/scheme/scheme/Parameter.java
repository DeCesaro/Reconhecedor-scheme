/**
 * generated by Xtext 2.17.0
 */
package pucrs.lp.scheme.scheme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pucrs.lp.scheme.scheme.Parameter#getN <em>N</em>}</li>
 *   <li>{@link pucrs.lp.scheme.scheme.Parameter#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @see pucrs.lp.scheme.scheme.SchemePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Command
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(String)
   * @see pucrs.lp.scheme.scheme.SchemePackage#getParameter_N()
   * @model
   * @generated
   */
  String getN();

  /**
   * Sets the value of the '{@link pucrs.lp.scheme.scheme.Parameter#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(String value);

  /**
   * Returns the value of the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' attribute.
   * @see #setAtom(String)
   * @see pucrs.lp.scheme.scheme.SchemePackage#getParameter_Atom()
   * @model
   * @generated
   */
  String getAtom();

  /**
   * Sets the value of the '{@link pucrs.lp.scheme.scheme.Parameter#getAtom <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' attribute.
   * @see #getAtom()
   * @generated
   */
  void setAtom(String value);

} // Parameter
