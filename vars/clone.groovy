def call(String url, String branch)
{
  echo "This is my first stage of cloning the code from github."
  git url: "${url}", branch: "${branch}"
  echo "code clonned successfully."
}
