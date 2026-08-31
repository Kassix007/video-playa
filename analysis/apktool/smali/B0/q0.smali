.class public final LB0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/u0;


# instance fields
.field public final q:Lc0/l;


# direct methods
.method public constructor <init>(LB0/p0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lc0/l;

    .line 5
    .line 6
    iput-object p1, p0, LB0/q0;->q:Lc0/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final x()Z
    .locals 1

    .line 1
    iget-object v0, p0, LB0/q0;->q:Lc0/l;

    .line 2
    .line 3
    iget-object v0, v0, Lc0/l;->q:Lc0/l;

    .line 4
    .line 5
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 6
    .line 7
    return v0
.end method
