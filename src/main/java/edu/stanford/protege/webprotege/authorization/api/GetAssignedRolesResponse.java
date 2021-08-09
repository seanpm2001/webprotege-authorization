package edu.stanford.protege.webprotege.authorization.api;

import edu.stanford.protege.webprotege.ipc.Response;

import java.util.Set;

public record GetAssignedRolesResponse(Subject subject, Resource resource, Set<RoleId> roles) implements Response {

}
