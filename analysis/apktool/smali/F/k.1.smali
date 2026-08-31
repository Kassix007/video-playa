.class public final LF/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/P;


# instance fields
.field public final synthetic a:LF/e;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(LF/e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/k;->a:LF/e;

    .line 5
    .line 6
    iput-boolean p2, p0, LF/k;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    iget-object v0, p0, LF/k;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LF/B;->e:Lw/d0;

    .line 8
    .line 9
    sget-object v2, Lw/d0;->q:Lw/d0;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LF/B;->g()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide v2, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v0, v2

    .line 27
    :goto_0
    long-to-int v0, v0

    .line 28
    return v0

    .line 29
    :cond_0
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, LF/B;->g()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const/16 v2, 0x20

    .line 38
    .line 39
    shr-long/2addr v0, v2

    .line 40
    goto :goto_0
.end method

.method public final b()F
    .locals 2

    .line 1
    iget-object v0, p0, LF/k;->a:LF/e;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/I1;->R(LF/N;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-float v0, v0

    .line 8
    return v0
.end method

.method public final c()LI0/b;
    .locals 3

    .line 1
    iget-boolean v0, p0, LF/k;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, LF/k;->a:LF/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, LI0/b;

    .line 9
    .line 10
    invoke-virtual {v2}, LF/e;->l()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v0, v2, v1}, LI0/b;-><init>(II)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, LI0/b;

    .line 19
    .line 20
    invoke-virtual {v2}, LF/e;->l()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v0, v1, v2}, LI0/b;-><init>(II)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final d()I
    .locals 2

    .line 1
    iget-object v0, p0, LF/k;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v1, v1, LF/B;->f:I

    .line 8
    .line 9
    neg-int v1, v1

    .line 10
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, LF/B;->d:I

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    return v1
.end method

.method public final e()F
    .locals 2

    .line 1
    iget-object v0, p0, LF/k;->a:LF/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, LF/e;->l()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v1, v0}, LF/S;->a(LF/B;I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    long-to-float v0, v0

    .line 16
    return v0
.end method

.method public final f(ILE/T;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LF/L;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, LF/k;->a:LF/e;

    .line 5
    .line 6
    invoke-direct {v0, v2, p1, v1}, LF/L;-><init>(LF/e;ILq5/c;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lv/W;->q:Lv/W;

    .line 10
    .line 11
    invoke-virtual {v2, p1, v0, p2}, LF/N;->e(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 16
    .line 17
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p1, p2

    .line 23
    :goto_0
    if-ne p1, v0, :cond_1

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    return-object p2
.end method
