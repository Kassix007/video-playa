.class public final LC0/U0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/u0;


# instance fields
.field public final q:I

.field public final r:Ljava/util/List;

.field public s:Ljava/lang/Float;

.field public t:Ljava/lang/Float;

.field public u:LI0/g;

.field public v:LI0/g;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LC0/U0;->q:I

    .line 5
    .line 6
    iput-object p2, p0, LC0/U0;->r:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, LC0/U0;->s:Ljava/lang/Float;

    .line 10
    .line 11
    iput-object p1, p0, LC0/U0;->t:Ljava/lang/Float;

    .line 12
    .line 13
    iput-object p1, p0, LC0/U0;->u:LI0/g;

    .line 14
    .line 15
    iput-object p1, p0, LC0/U0;->v:LI0/g;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final x()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC0/U0;->r:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
