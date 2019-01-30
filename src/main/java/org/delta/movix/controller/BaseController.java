package org.delta.movix.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public abstract class BaseController {

    public Logger logger = LoggerFactory.getLogger(getClass());

}
