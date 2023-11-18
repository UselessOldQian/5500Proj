package edu.northeastern.cs5500project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import edu.northeastern.cs5500project.final_edit_profile;

public class FinalEditProfileTest {

  private final_edit_profile editProfile;

  @Before
  public void setUp() {
    editProfile = new final_edit_profile();
  }

  @Test
  public void testPasswordCanBeVerified_BothPasswordsValid() {
    assertTrue(editProfile.passwordCanBeVerified("123456", "abcdef"));
  }

  @Test
  public void testPasswordCanBeVerified_OldPasswordInvalid() {
    assertFalse(editProfile.passwordCanBeVerified("1234", "abcdef"));
  }

  @Test
  public void testPasswordCanBeVerified_NewPasswordInvalid() {
    assertFalse(editProfile.passwordCanBeVerified("123456", "abc"));
  }

  @Test
  public void testPasswordCanBeVerified_BothPasswordsInvalid() {
    assertFalse(editProfile.passwordCanBeVerified("123", "ab"));
  }

  @Test
  public void testPasswordCanBeVerified_BothPasswordsEmpty() {
    assertFalse(editProfile.passwordCanBeVerified("", ""));
  }
}
