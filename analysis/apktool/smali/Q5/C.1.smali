.class public final LQ5/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/c;
.implements Ls5/d;


# instance fields
.field public final q:Lq5/c;

.field public final r:Lq5/h;


# direct methods
.method public constructor <init>(Lq5/c;Lq5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ5/C;->q:Lq5/c;

    .line 5
    .line 6
    iput-object p2, p0, LQ5/C;->r:Lq5/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCallerFrame()Ls5/d;
    .locals 2

    .line 1
    iget-object v0, p0, LQ5/C;->q:Lq5/c;

    .line 2
    .line 3
    instance-of v1, v0, Ls5/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ls5/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getContext()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/C;->r:Lq5/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ5/C;->q:Lq5/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
