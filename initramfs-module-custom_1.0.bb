LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
DESCRIPTION = "Example initramfs module that runs some custom logic."

PR = "r0"

RDEPENDS_${PN} = "initramfs-uniboot"

SRC_URI = "file://20-custom.sh"


do_install() {
	install -d ${D}/initrd.d
        install -m 0755 ${WORKDIR}/20-custom.sh ${D}/initrd.d/
}

PACKAGE_ARCH = "all"
FILES_${PN} += " /initrd.d/* "
