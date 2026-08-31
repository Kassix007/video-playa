.class public final Lc/i;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lc/h;

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(Lc/h;ZLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/i;->q:Lc/h;

    .line 2
    .line 3
    iput-boolean p2, p0, Lc/i;->r:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance p1, Lc/i;

    .line 2
    .line 3
    iget-object v0, p0, Lc/i;->q:Lc/h;

    .line 4
    .line 5
    iget-boolean v1, p0, Lc/i;->r:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lc/i;-><init>(Lc/h;ZLq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lc/i;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc/i;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lc/i;->q:Lc/h;

    .line 5
    .line 6
    iget-boolean v0, p0, Lc/i;->r:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v1, p1, Lc/h;->g:Z

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, p1, Lb/u;->a:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p1, Lc/h;->f:Lcom/google/android/gms/internal/measurement/O1;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/O1;->b()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iput-boolean v0, p1, Lb/u;->a:Z

    .line 26
    .line 27
    iget-object p1, p1, Lb/u;->c:Lkotlin/jvm/internal/k;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 35
    .line 36
    return-object p1
.end method
