
package com.infobip.client.channels.webrtc.model;

public final class Capabilities {
    private final Recording recording;

    /**
     * <p>
     * Create Capabilities with required fields.
     * </p>
     *
     * @param recording Whether to allow recording calls during the session.
     *     Possible values are ALWAYS, ON_DEMAND and DISABLED. If want to set ALWAYS
     *     or ON_DEMAND, the capability must be enabled on account level (please
     *     contact your account manager for this).
     */
    public Capabilities(Recording recording) {
        this.recording = recording;
    }

    public Recording getRecording() {
        return recording;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((recording == null) ? 0 : recording.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Capabilities)) {
            return false;
        }
        Capabilities other = (Capabilities) obj;
        if (recording != other.recording) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Capabilities [recording=" + recording + "]";
    }
}
