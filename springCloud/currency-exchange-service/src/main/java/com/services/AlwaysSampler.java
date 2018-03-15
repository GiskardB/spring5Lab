package com.services;

import brave.sampler.Sampler;

/**
 * @author Spencer Gibb
 */
public class AlwaysSampler extends Sampler {

    @Override
    public boolean isSampled(long l) {
        return true;
    }
}