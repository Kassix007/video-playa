.class public final LI5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI5/i;
.implements LI5/d;


# static fields
.field public static final a:LI5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LI5/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI5/e;->a:LI5/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)LI5/i;
    .locals 0

    .line 1
    sget-object p1, LI5/e;->a:LI5/e;

    .line 2
    .line 3
    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Ln5/r;->q:Ln5/r;

    .line 2
    .line 3
    return-object v0
.end method
