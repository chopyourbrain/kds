package `fun`.kotlingang.kds.annotation


@RequiresOptIn(message = """
APIs marked with this annotation are recommended to use only if you are *sure* what are you doing and know a function contract.
In most cases it shouldn't be used by end users
""")
annotation class DelicateKDSApi
