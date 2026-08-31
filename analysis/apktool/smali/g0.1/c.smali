.class public final Lg0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW0/c;


# instance fields
.field public q:Lg0/a;

.field public r:Lk3/d;


# virtual methods
.method public final a(LB5/c;)Lk3/d;
    .locals 3

    .line 1
    new-instance v0, Lk3/d;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lk3/d;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    check-cast p1, Lkotlin/jvm/internal/n;

    .line 10
    .line 11
    iput-object p1, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v0, p0, Lg0/c;->r:Lk3/d;

    .line 14
    .line 15
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/c;->q:Lg0/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg0/a;->b()LW0/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LW0/c;->b()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, Lg0/c;->q:Lg0/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg0/a;->b()LW0/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LW0/c;->l()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
