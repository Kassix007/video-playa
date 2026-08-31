.class public final LU5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM5/f;
.implements LM5/A0;


# instance fields
.field public final q:LM5/h;

.field public final synthetic r:LU5/c;


# direct methods
.method public constructor <init>(LU5/c;LM5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU5/b;->r:LU5/c;

    .line 5
    .line 6
    iput-object p2, p0, LU5/b;->q:LM5/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LR5/s;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LU5/b;->q:LM5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LM5/h;->a(LR5/s;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LU5/b;->q:LM5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM5/h;->g(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getContext()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LU5/b;->q:LM5/h;

    .line 2
    .line 3
    iget-object v0, v0, LM5/h;->u:Lq5/h;

    .line 4
    .line 5
    return-object v0
.end method

.method public final n(Ljava/lang/Object;LB5/f;)V
    .locals 3

    .line 1
    sget-object p1, LU5/c;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iget-object v0, p0, LU5/b;->r:LU5/c;

    .line 5
    .line 6
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, LJ5/i;

    .line 10
    .line 11
    const/4 p2, 0x6

    .line 12
    invoke-direct {p1, p2, v0, p0}, LJ5/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, LU5/b;->q:LM5/h;

    .line 16
    .line 17
    iget v0, p2, LM5/F;->s:I

    .line 18
    .line 19
    new-instance v1, LM5/g;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, v2, p1}, LM5/g;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    invoke-virtual {p2, p1, v0, v1}, LM5/h;->B(Ljava/lang/Object;ILB5/f;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final o(Ljava/lang/Object;LB5/f;)LE4/f;
    .locals 2

    .line 1
    check-cast p1, Lm5/y;

    .line 2
    .line 3
    new-instance p2, LM5/g;

    .line 4
    .line 5
    iget-object v0, p0, LU5/b;->r:LU5/c;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, LM5/g;-><init>(LU5/c;LU5/b;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LU5/b;->q:LM5/h;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, LM5/h;->o(Ljava/lang/Object;LB5/f;)LE4/f;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p2, LU5/c;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU5/b;->q:LM5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM5/h;->q(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU5/b;->q:LM5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
