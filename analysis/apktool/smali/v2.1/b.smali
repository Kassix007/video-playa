.class public final Lv2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv2/h;

.field public final b:LU5/i;


# direct methods
.method public constructor <init>(ILv2/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lv2/b;->a:Lv2/h;

    .line 5
    .line 6
    sget p2, LU5/j;->a:I

    .line 7
    .line 8
    new-instance p2, LU5/i;

    .line 9
    .line 10
    invoke-direct {p2, p1}, LU5/h;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lv2/b;->b:LU5/i;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lv2/b;

    .line 2
    .line 3
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const-class v0, Lv2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
