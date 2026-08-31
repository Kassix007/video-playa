.class public final Ld6/v;
.super Ld6/w;
.source "SourceFile"


# instance fields
.field public final synthetic q:J

.field public final synthetic r:Lq6/g;


# direct methods
.method public constructor <init>(JLq6/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ld6/v;->q:J

    .line 5
    .line 6
    iput-object p3, p0, Ld6/v;->r:Lq6/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final O()Lq6/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/v;->r:Lq6/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld6/v;->q:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()Ld6/p;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
