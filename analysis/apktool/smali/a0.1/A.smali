.class public final La0/A;
.super La0/h;
.source "SourceFile"


# instance fields
.field public final e:La0/h;

.field public final f:Z

.field public g:LB5/c;

.field public final h:J


# direct methods
.method public constructor <init>(La0/h;LB5/c;Z)V
    .locals 3

    .line 1
    sget-object v0, La0/n;->a:LB0/G0;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    sget-object v2, La0/l;->u:La0/l;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, La0/h;-><init>(JLa0/l;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La0/A;->e:La0/h;

    .line 11
    .line 12
    iput-boolean p3, p0, La0/A;->f:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, La0/h;->e()LB5/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    :cond_0
    sget-object p1, La0/n;->i:La0/c;

    .line 23
    .line 24
    iget-object p1, p1, La0/d;->e:LB5/c;

    .line 25
    .line 26
    :cond_1
    const/4 p3, 0x0

    .line 27
    invoke-static {p2, p1, p3}, La0/n;->l(LB5/c;LB5/c;Z)LB5/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, La0/A;->g:LB5/c;

    .line 32
    .line 33
    invoke-static {}, LX/k;->b()J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    iput-wide p1, p0, La0/A;->h:J

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La0/h;->c:Z

    .line 3
    .line 4
    iget-boolean v0, p0, La0/A;->f:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La0/A;->e:La0/h;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, La0/h;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d()La0/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, La0/A;->v()La0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La0/h;->d()La0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final e()LB5/c;
    .locals 1

    .line 1
    iget-object v0, p0, La0/A;->g:LB5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La0/A;->v()La0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La0/h;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final g()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La0/A;->v()La0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La0/h;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final i()LB5/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-static {}, La0/r;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    throw v0
.end method

.method public final l()V
    .locals 1

    .line 1
    invoke-static {}, La0/r;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    throw v0
.end method

.method public final m()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La0/A;->v()La0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La0/h;->m()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(La0/u;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La0/A;->v()La0/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La0/h;->n(La0/u;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(LB5/c;)La0/h;
    .locals 3

    .line 1
    iget-object v0, p0, La0/A;->g:LB5/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, La0/n;->l(LB5/c;LB5/c;Z)LB5/c;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, La0/A;->v()La0/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2}, La0/h;->u(LB5/c;)La0/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1, v1}, La0/n;->h(La0/h;LB5/c;Z)La0/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final v()La0/h;
    .locals 1

    .line 1
    iget-object v0, p0, La0/A;->e:La0/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La0/n;->i:La0/c;

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method
