/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author edarsow
 */
public interface CrashTestableWithMat extends CrashTestable{
    public NotFrameMaterial getFrameMaterial();
    public boolean notDidAirbagDeploy();
}
