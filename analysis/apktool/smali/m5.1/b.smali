.class public final Lm5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/c;


# instance fields
.field public q:Lb6/g;

.field public r:Lq5/c;

.field public s:Ljava/lang/Object;


# virtual methods
.method public final getContext()Lq5/h;
    .locals 1

    .line 1
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lm5/b;->r:Lq5/c;

    .line 3
    .line 4
    iput-object p1, p0, Lm5/b;->s:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
