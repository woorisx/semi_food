package com.semi.domain.rpa;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class RpaSchedulingFlagTest {

    @Test
    void autoRunScheduleDoesNothingWhenDisabledByDefault() {
        RpaAutoRunService service = new RpaAutoRunService(null, null, null, null);

        assertThatCode(service::checkAndRunRpaSchedule).doesNotThrowAnyException();
    }

    @Test
    void recoveryScheduleDoesNothingWhenDisabledByDefault() {
        RpaRecoveryService service = new RpaRecoveryService(null);

        assertThatCode(service::recoverStaleRunningLogsOnSchedule).doesNotThrowAnyException();
    }
}
