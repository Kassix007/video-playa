.class public final LO3/J;
.super LI3/a;
.source "SourceFile"

# interfaces
.implements LO3/K;


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LI3/a;->K()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, LI3/a;->M(Landroid/os/Parcel;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
