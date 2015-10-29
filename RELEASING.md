# Releasing a new version of SockJS Servlet

### Prerequisites

Make sure you have an account at https://oss.sonatype.org and that
you're a member of the org.projectodd group.

### Build and Deploy Release

    $ support/release.sh RELEASE_VERSION NEXT_VERSION

### Verify Staging Artifacts

Look for our staging repository at
https://oss.sonatype.org/#stagingRepositories - the name will start
with "orgprojectodd". Click the repository's "Content" tab and make
sure the artifacts and versions listed look correct.

### Release the Staging Deployment

http://central.sonatype.org/pages/releasing-the-deployment.html

From the staging repository list, highlight our repository and click
the "Close" button at the top of the grid followed by the "Release"
button. If the close process fails, you'll want to figure out why,
"Drop" instead of "Release" this repository, and start again.

### Push Changes to GitHub

    git push --tags origin projectodd:projectodd
