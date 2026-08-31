.class public final Lw2/c;
.super Lq6/m;
.source "SourceFile"


# virtual methods
.method public final W(Lq6/x;Z)Lq6/E;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lq6/x;->c()Lq6/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lq6/l;->c(Lq6/x;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Lq6/m;->W(Lq6/x;Z)Lq6/E;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
