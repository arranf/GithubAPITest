package party.hunchbacktank.githubapitest.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arran on 07/03/2016.
 */
public class Source {

    private Integer id;
    private Owner owner;
    private String name;
    private String fullName;
    private String description;
    private Boolean _private;
    private Boolean fork;
    private String url;
    private String htmlUrl;
    private String archiveUrl;
    private String assigneesUrl;
    private String blobsUrl;
    private String branchesUrl;
    private String cloneUrl;
    private String collaboratorsUrl;
    private String commentsUrl;
    private String commitsUrl;
    private String compareUrl;
    private String contentsUrl;
    private String contributorsUrl;
    private String deploymentsUrl;
    private String downloadsUrl;
    private String eventsUrl;
    private String forksUrl;
    private String gitCommitsUrl;
    private String gitRefsUrl;
    private String gitTagsUrl;
    private String gitUrl;
    private String hooksUrl;
    private String issueCommentUrl;
    private String issueEventsUrl;
    private String issuesUrl;
    private String keysUrl;
    private String labelsUrl;
    private String languagesUrl;
    private String mergesUrl;
    private String milestonesUrl;
    private String mirrorUrl;
    private String notificationsUrl;
    private String pullsUrl;
    private String releasesUrl;
    private String sshUrl;
    private String stargazersUrl;
    private String statusesUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String svnUrl;
    private String tagsUrl;
    private String teamsUrl;
    private String treesUrl;
    private String homepage;
    private Object language;
    private Integer forksCount;
    private Integer stargazersCount;
    private Integer watchersCount;
    private Integer size;
    private String defaultBranch;
    private Integer openIssuesCount;
    private Boolean hasIssues;
    private Boolean hasWiki;
    private Boolean hasPages;
    private Boolean hasDownloads;
    private String pushedAt;
    private String createdAt;
    private String updatedAt;
    private Permissions permissions;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     * The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * @param fullName
     * The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     *
     * @param _private
     * The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     *
     * @return
     * The fork
     */
    public Boolean getFork() {
        return fork;
    }

    /**
     *
     * @param fork
     * The fork
     */
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     *
     * @param htmlUrl
     * The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     *
     * @return
     * The archiveUrl
     */
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     *
     * @param archiveUrl
     * The archive_url
     */
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     *
     * @return
     * The assigneesUrl
     */
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    /**
     *
     * @param assigneesUrl
     * The assignees_url
     */
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
     *
     * @return
     * The blobsUrl
     */
    public String getBlobsUrl() {
        return blobsUrl;
    }

    /**
     *
     * @param blobsUrl
     * The blobs_url
     */
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    /**
     *
     * @return
     * The branchesUrl
     */
    public String getBranchesUrl() {
        return branchesUrl;
    }

    /**
     *
     * @param branchesUrl
     * The branches_url
     */
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    /**
     *
     * @return
     * The cloneUrl
     */
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     *
     * @param cloneUrl
     * The clone_url
     */
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    /**
     *
     * @return
     * The collaboratorsUrl
     */
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    /**
     *
     * @param collaboratorsUrl
     * The collaborators_url
     */
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
     *
     * @return
     * The commentsUrl
     */
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     *
     * @param commentsUrl
     * The comments_url
     */
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     *
     * @return
     * The commitsUrl
     */
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     *
     * @param commitsUrl
     * The commits_url
     */
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
     *
     * @return
     * The compareUrl
     */
    public String getCompareUrl() {
        return compareUrl;
    }

    /**
     *
     * @param compareUrl
     * The compare_url
     */
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    /**
     *
     * @return
     * The contentsUrl
     */
    public String getContentsUrl() {
        return contentsUrl;
    }

    /**
     *
     * @param contentsUrl
     * The contents_url
     */
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    /**
     *
     * @return
     * The contributorsUrl
     */
    public String getContributorsUrl() {
        return contributorsUrl;
    }

    /**
     *
     * @param contributorsUrl
     * The contributors_url
     */
    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
     *
     * @return
     * The deploymentsUrl
     */
    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    /**
     *
     * @param deploymentsUrl
     * The deployments_url
     */
    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    /**
     *
     * @return
     * The downloadsUrl
     */
    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    /**
     *
     * @param downloadsUrl
     * The downloads_url
     */
    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     *
     * @return
     * The forksUrl
     */
    public String getForksUrl() {
        return forksUrl;
    }

    /**
     *
     * @param forksUrl
     * The forks_url
     */
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
     *
     * @return
     * The gitCommitsUrl
     */
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    /**
     *
     * @param gitCommitsUrl
     * The git_commits_url
     */
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
     *
     * @return
     * The gitRefsUrl
     */
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    /**
     *
     * @param gitRefsUrl
     * The git_refs_url
     */
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
     *
     * @return
     * The gitTagsUrl
     */
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    /**
     *
     * @param gitTagsUrl
     * The git_tags_url
     */
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
     *
     * @return
     * The gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     *
     * @param gitUrl
     * The git_url
     */
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
     *
     * @return
     * The hooksUrl
     */
    public String getHooksUrl() {
        return hooksUrl;
    }

    /**
     *
     * @param hooksUrl
     * The hooks_url
     */
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    /**
     *
     * @return
     * The issueCommentUrl
     */
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     *
     * @param issueCommentUrl
     * The issue_comment_url
     */
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     *
     * @return
     * The issueEventsUrl
     */
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    /**
     *
     * @param issueEventsUrl
     * The issue_events_url
     */
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
     *
     * @return
     * The issuesUrl
     */
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     *
     * @param issuesUrl
     * The issues_url
     */
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     *
     * @return
     * The keysUrl
     */
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     *
     * @param keysUrl
     * The keys_url
     */
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
     *
     * @return
     * The labelsUrl
     */
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     *
     * @param labelsUrl
     * The labels_url
     */
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    /**
     *
     * @return
     * The languagesUrl
     */
    public String getLanguagesUrl() {
        return languagesUrl;
    }

    /**
     *
     * @param languagesUrl
     * The languages_url
     */
    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    /**
     *
     * @return
     * The mergesUrl
     */
    public String getMergesUrl() {
        return mergesUrl;
    }

    /**
     *
     * @param mergesUrl
     * The merges_url
     */
    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    /**
     *
     * @return
     * The milestonesUrl
     */
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    /**
     *
     * @param milestonesUrl
     * The milestones_url
     */
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     *
     * @return
     * The mirrorUrl
     */
    public String getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     *
     * @param mirrorUrl
     * The mirror_url
     */
    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
     *
     * @return
     * The notificationsUrl
     */
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     *
     * @param notificationsUrl
     * The notifications_url
     */
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     *
     * @return
     * The pullsUrl
     */
    public String getPullsUrl() {
        return pullsUrl;
    }

    /**
     *
     * @param pullsUrl
     * The pulls_url
     */
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    /**
     *
     * @return
     * The releasesUrl
     */
    public String getReleasesUrl() {
        return releasesUrl;
    }

    /**
     *
     * @param releasesUrl
     * The releases_url
     */
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    /**
     *
     * @return
     * The sshUrl
     */
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     *
     * @param sshUrl
     * The ssh_url
     */
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
     *
     * @return
     * The stargazersUrl
     */
    public String getStargazersUrl() {
        return stargazersUrl;
    }

    /**
     *
     * @param stargazersUrl
     * The stargazers_url
     */
    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
     *
     * @return
     * The statusesUrl
     */
    public String getStatusesUrl() {
        return statusesUrl;
    }

    /**
     *
     * @param statusesUrl
     * The statuses_url
     */
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    /**
     *
     * @return
     * The subscribersUrl
     */
    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    /**
     *
     * @param subscribersUrl
     * The subscribers_url
     */
    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
     *
     * @return
     * The subscriptionUrl
     */
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     *
     * @param subscriptionUrl
     * The subscription_url
     */
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     *
     * @return
     * The svnUrl
     */
    public String getSvnUrl() {
        return svnUrl;
    }

    /**
     *
     * @param svnUrl
     * The svn_url
     */
    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    /**
     *
     * @return
     * The tagsUrl
     */
    public String getTagsUrl() {
        return tagsUrl;
    }

    /**
     *
     * @param tagsUrl
     * The tags_url
     */
    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    /**
     *
     * @return
     * The teamsUrl
     */
    public String getTeamsUrl() {
        return teamsUrl;
    }

    /**
     *
     * @param teamsUrl
     * The teams_url
     */
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    /**
     *
     * @return
     * The treesUrl
     */
    public String getTreesUrl() {
        return treesUrl;
    }

    /**
     *
     * @param treesUrl
     * The trees_url
     */
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    /**
     *
     * @return
     * The homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     *
     * @param homepage
     * The homepage
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     *
     * @return
     * The language
     */
    public Object getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public void setLanguage(Object language) {
        this.language = language;
    }

    /**
     *
     * @return
     * The forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     *
     * @param forksCount
     * The forks_count
     */
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
     *
     * @return
     * The stargazersCount
     */
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     *
     * @param stargazersCount
     * The stargazers_count
     */
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
     *
     * @return
     * The watchersCount
     */
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     *
     * @param watchersCount
     * The watchers_count
     */
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
     *
     * @return
     * The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     *
     * @param defaultBranch
     * The default_branch
     */
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     *
     * @return
     * The openIssuesCount
     */
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     *
     * @param openIssuesCount
     * The open_issues_count
     */
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     *
     * @return
     * The hasIssues
     */
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     *
     * @param hasIssues
     * The has_issues
     */
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
     *
     * @return
     * The hasWiki
     */
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     *
     * @param hasWiki
     * The has_wiki
     */
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
     *
     * @return
     * The hasPages
     */
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     *
     * @param hasPages
     * The has_pages
     */
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    /**
     *
     * @return
     * The hasDownloads
     */
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     *
     * @param hasDownloads
     * The has_downloads
     */
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
     *
     * @return
     * The pushedAt
     */
    public String getPushedAt() {
        return pushedAt;
    }

    /**
     *
     * @param pushedAt
     * The pushed_at
     */
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     * The permissions
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     *
     * @param permissions
     * The permissions
     */
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
