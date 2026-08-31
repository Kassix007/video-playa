.class public final Lc/h;
.super Lb/u;
.source "SourceFile"


# instance fields
.field public d:LM5/w;

.field public e:LB5/e;

.field public f:Lcom/google/android/gms/internal/measurement/O1;

.field public g:Z


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/O1;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iput-boolean v1, v0, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 15
    .line 16
    :goto_0
    iput-boolean v1, p0, Lc/h;->g:Z

    .line 17
    .line 18
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v2, v0, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/O1;->b()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lcom/google/android/gms/internal/measurement/O1;

    .line 21
    .line 22
    iget-object v3, p0, Lc/h;->d:LM5/w;

    .line 23
    .line 24
    iget-object v4, p0, Lc/h;->e:LB5/e;

    .line 25
    .line 26
    invoke-direct {v0, v3, v2, v4, p0}, Lcom/google/android/gms/internal/measurement/O1;-><init>(LM5/w;ZLB5/e;Lc/h;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/O1;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LO5/e;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, LO5/e;->f(Ljava/lang/Throwable;)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    iput-boolean v2, v0, Lcom/google/android/gms/internal/measurement/O1;->a:Z

    .line 48
    .line 49
    :goto_0
    iput-boolean v2, p0, Lc/h;->g:Z

    .line 50
    .line 51
    return-void
.end method

.method public final c(Lb/a;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lb/u;->c(Lb/a;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/O1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO5/e;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d(Lb/a;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lb/u;->d(Lb/a;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/O1;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean p1, p0, Lb/u;->a:Z

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance p1, Lcom/google/android/gms/internal/measurement/O1;

    .line 17
    .line 18
    iget-object v1, p0, Lc/h;->d:LM5/w;

    .line 19
    .line 20
    iget-object v2, p0, Lc/h;->e:LB5/e;

    .line 21
    .line 22
    invoke-direct {p1, v1, v0, v2, p0}, Lcom/google/android/gms/internal/measurement/O1;-><init>(LM5/w;ZLB5/e;Lc/h;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 26
    .line 27
    :cond_1
    iput-boolean v0, p0, Lc/h;->g:Z

    .line 28
    .line 29
    return-void
.end method
