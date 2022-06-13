package com.esprit.offer.Exception;

import java.util.UUID;

public class OffreNotFoundException extends Throwable {
    public OffreNotFoundException(UUID id) {
        super("Cannot find evaluation number [" + id + "]");
    }
}
