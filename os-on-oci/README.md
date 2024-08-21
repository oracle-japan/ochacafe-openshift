# 注意事項
- 個人コンパートメントにOpenShiftを構成する場合、サービスリミットの関係で複数のシェイプを使う必要がある。
- tag namespaceをorasejapanでは作成できないので、利用しない
- 動的グループも同様に作成できないので、コンパートメントにデフォルトで与えられた動的グループをスタック作成時に指定する


個人コンパートメントに作成する場合 -> individual

プロジェクトコンパートメントに作成する場合 -> project-compartment


インストール時に参照するサイト
- https://docs.redhat.com/en/documentation/openshift_container_platform/4.15/html/installing/installing-on-oci#complete-assisted-installer-oci_installing-oci-assisted-installer
- https://docs.oracle.com/ja-jp/iaas/Content/openshift-on-oci/install-prereq.htm