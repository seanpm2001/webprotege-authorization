package edu.stanford.protege.webprotege.authorization.api;

import edu.stanford.protege.webprotege.cmd.Response;

import java.util.Set;

public record GetResourcesResponse(Subject subject, ActionId actionId, Set<Resource> resources) implements Response {

}
