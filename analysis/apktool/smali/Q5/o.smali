.class public final LQ5/o;
.super LQ5/i;
.source "SourceFile"


# instance fields
.field public final u:Ls5/i;


# direct methods
.method public constructor <init>(LB5/f;LP5/h;Lq5/h;ILO5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4, p5}, LQ5/i;-><init>(LP5/h;Lq5/h;ILO5/a;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Ls5/i;

    .line 5
    .line 6
    iput-object p1, p0, LQ5/o;->u:Ls5/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Lq5/h;ILO5/a;)LQ5/g;
    .locals 6

    .line 1
    new-instance v0, LQ5/o;

    .line 2
    .line 3
    iget-object v1, p0, LQ5/o;->u:Ls5/i;

    .line 4
    .line 5
    iget-object v2, p0, LQ5/i;->t:LP5/h;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, LQ5/o;-><init>(LB5/f;LP5/h;Lq5/h;ILO5/a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final g(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LQ5/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, LQ5/n;-><init>(LQ5/o;LP5/i;Lq5/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    return-object p1
.end method
