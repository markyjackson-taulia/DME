/*******************************************************************************
 * Copyright (c) 2016 AT&T Intellectual Property. All rights reserved.
 *******************************************************************************/
package com.att.aft.dme2.api.util;

import java.util.Map;

public class DME2ExchangeRequestContext {
	
		private String service;
		private long timeoutMs;
		private Map<String,String> queryParams;
		private Map<String,String> requestHeaders;
		private String preferredRouteOffer;
    private String preferredVersion;
    /** special request flag that is set to force preferred Route offer from other routes with different sticky key*/
    private boolean forcePreferredRouteOffer = false;
		
		public DME2ExchangeRequestContext(String service, long timeoutMs, Map<String,String> queryParams, Map<String,String> requestHeaders) {
			this.service = service;
			this.timeoutMs = timeoutMs;

			this.queryParams = queryParams;
			this.requestHeaders = requestHeaders;
		}
		
		public String getService() {
			return service;
		}
		public void setService(String service) {
			this.service = service;
		}
		public Long getTimeoutMs() {
			return timeoutMs;
		}
		public void setTimeoutMs(Long timeoutMs) {
			this.timeoutMs = timeoutMs;
		}

		public Map<String,String> getQueryParams() {
			return queryParams;
		}
		public void setQueryParams(Map<String,String> queryParams) {
			this.queryParams = queryParams;
		}
		public Map<String,String> getRequestHeaders() {
			return requestHeaders;
		}
		public void setRequestHeaders(Map<String,String> requestHeaders) {
			this.requestHeaders = requestHeaders;
		}

		public String getPreferredRouteOffer() {
			return preferredRouteOffer;
		}

		public void setPreferredRouteOffer(String preferredRouteOffer) {
			this.preferredRouteOffer = preferredRouteOffer;
		}

  public void setTimeoutMs( long timeoutMs ) {
    this.timeoutMs = timeoutMs;
  }

  public String getPreferredVersion() {
    return preferredVersion;
  }

  public void setPreferredVersion( String preferredVersion ) {
    this.preferredVersion = preferredVersion;
  }

  public boolean isForcePreferredRouteOffer() {
    return forcePreferredRouteOffer;
  }

  public void setForcePreferredRouteOffer( boolean forcePreferredRouteOffer ) {
    this.forcePreferredRouteOffer = forcePreferredRouteOffer;
  }
}
