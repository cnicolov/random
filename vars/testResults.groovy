#!groovy

import hudson.model.Run
import hudson.tasks.junit.TestResult
import hudson.tasks.junit.TestResultAction

@NonCPS
TestResult call() {
  def build = currentBuild.rawBuild
  TestResultAction action = build.getAction(TestResultAction.class)
  return action.getResult()
}
